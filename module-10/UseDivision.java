public class UseDivision {
    public static void main(String[] args) {
        InternationalDivision intDiv1 = new InternationalDivision("Europe Sales", 101, "Germany", "German");
        InternationalDivision intDiv2 = new InternationalDivision("Asia Operations", 102, "Japan", "Japanese");

        DomesticDivision domDiv1 = new DomesticDivision("East Coast", 201, "New York");
        DomesticDivision domDiv2 = new DomesticDivision("West Coast", 202, "California");

        intDiv1.display();
        intDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}
