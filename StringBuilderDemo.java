class StringBuilderDemo{
public static void main(String[]args){
StringBuilder sb=new StringBuilder();
sb.append("hello");
sb.append("");
sb.append("world");
String result=sb.toString();
System.out.println("StringBuilder result:"+result);
}
}