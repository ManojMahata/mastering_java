public class PhraceOMatci{
    public static void main(String[] args){
        // three words
        String[] wordListOne = {"24/7", "smart", "multi-tier"};
        String[] wordListTwo = {"sticky", "focused", "targated"};
        String[] wordListThree = {"process", "vision", "mission"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // generate three random numbers;
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        // build a phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        // print out the phrase
        System.out.println("What we need is a " + phrase);

    }// end main method
}
