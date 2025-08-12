package myPackage;
public class Jv_10_Strings {
    public static void main(String[] args) {
//        String name = "Prabin";
//        String fname = "Sobit";
//        System.out.println(fullName);

//        Scanner sc=new Scanner(System.in);
//        String name=sc.nextLine();
//        System.out.println("Your name is "+name);

        // Concatenation---- Adding two strings
//        String firstName="Sobit";
//        String lastName="Shrestha";
//        String fullName=firstName+" "+lastName;
//        System.out.println(fullName.length());
//
//        //CharAt
//        for(int i=0; i<fullName.length(); i++){
//            System.out.println(fullName.charAt(i));

//        if(name.compareTo(fname)==0){
//            System.out.println("Strings are equal");
//        }
//        else{
//            System.out.println("Strings are not equal");
//        }

//        if (new String("Aashish") == new String("Aashish")) {
//            System.out.println("Equal");
//        } else {
//            System.out.println("Not Equal");
//        }

        //--------Substrings
//        String sentence="My name is Aashish";
//        String name=sentence.substring(11, sentence.length());
//        System.out.println(name);

        //---STRING BUILDER--------
        StringBuilder sb=new StringBuilder("Jonny");
//        System.out.println(sb);

//        sb.setCharAt(0,'p');
        sb.insert(2, 'n');
//        System.out.println(sb);

        sb.delete(2,3);
//        System.out.println(sb);

        sb.append("y");
//        System.out.println(sb.length());

//        ------Reverse the string

    for(int i=0; i<sb.length()/2; i++){
        int front=i;
        int back=sb.length()-1-i;

        char frontChar=sb.charAt(front);
        char backChar=sb.charAt(back);

        sb.setCharAt(front, backChar);
        sb.setCharAt(back, frontChar);
    }
        System.out.println(sb);
    }
}