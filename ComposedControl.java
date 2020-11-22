public  class ComposedControl implements IControl{
    private String color;
    private IControl left;
    private IControl right;

    public void apply(String color){
        this.color = color;
        left.apply(color);
        right.apply(color);
    }

    public void print(){
        System.out.println(color);
        left.print();
        right.print();
    }
}