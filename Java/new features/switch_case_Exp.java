class switch_case_Exp
{
    public static void main(String args[])
    {
        String day = "saturday";
        String result = "";
        result = switch(day)
        {
            case "sunday"->"Holiday !";
              
            case "saturday"->"Weekend !";
               
            default ->"Working day! ";
        };
            System.out.println(result);
    }
}