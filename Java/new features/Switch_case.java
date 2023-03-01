class Switch_case
{
    public static void main(String args[])
    {
        String day = "monday";

        switch(day)
        {
            case "sunday"->System.out.println("Holiday !");
              
            case "saturday"->System.out.println("Weekend !");
               
            default ->System.out.println("Working day! ");
        }
    }
}