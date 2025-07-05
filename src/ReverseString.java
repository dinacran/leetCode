void main(){
    System.out.println(reverse("reverse string"));
    System.out.println(new StringBuilder("reverse string").reverse());

    System.out.println(1 > 2 ? "a " : "b ".repeat(10));
}

String reverse(String str){
    if(str.length() < 2) return str;

    int mid = str.length()/2;

    return reverse(str.substring(mid, str.length())) + reverse(str.substring(0, mid));
}