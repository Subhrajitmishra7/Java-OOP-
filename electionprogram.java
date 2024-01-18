import java.io.IOException;

class election
{
    int voteCount()
    { 
        return 0;
    }
}
class BJP extends election
{
    int voteCount()
    {   
        int votes  = 5000;
        System.out.println("No of votes:" + votes);
        return votes;
    }
}
class BJD extends election
{
    int voteCount()
    {   
        int votes  = 2000;
        System.out.println("No of votes:" + votes);
        return votes;
    }
}
class Congress extends election
{
    int voteCount()
    {   
        int votes  = 500;
        System.out.println("No of votes:" + votes);
        return votes;
    }
}

class electionprogram
{
    public static void main(String args[])throws IOException
    {
        election a = new election();//election's reference and election's object
        election b = new BJP();//election's reference but BJP's object
        int BJPvotes = b.voteCount();
        election c = new BJD();//election's reference but BJD's object
        int BJDvotes = c.voteCount();
        election d = new Congress();//election's reference but Congress's object
        int Congressvotes = d.voteCount();
        int maxVotes = Math.max(BJPvotes,Math.max(BJDvotes,Congressvotes));
        System.out.println(maxVotes);
    }
}
