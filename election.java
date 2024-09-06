class election
{
    int voteCount()
    { 
        return 0;
    }
}
class BPJ extends election
{
    int voteCount()
    {
        return 1000;
    }
}
class BJD extends election
{
    int voteCount()
    {
        return 500;
    }
}
class Congress extends election
{
    int voteCount()
    {
        return 200;
    }
}

