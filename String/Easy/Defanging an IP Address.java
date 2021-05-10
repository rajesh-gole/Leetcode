public class Main
{
    static String address(String s)
    {
        final StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='.')
                sb.append("[.]");
            else
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }
	public static void main(String[] args) {
		String s="1.1.1.";
		System.out.println(address(s));
	}
}

//#1108
// return address.replace(".", "[.]");