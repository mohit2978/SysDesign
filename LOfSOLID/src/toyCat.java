public class toyCat implements iCat{
    @Override
    public void makesound() {
        System.out.println("mechanical meowwww");
    }

    @Override
    public void drinkMilk() {
        throw new RuntimeException("I don't drink milk");
    }
}
