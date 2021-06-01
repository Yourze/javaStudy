package copy;

public class ShallowCloneExample implements Cloneable{
    private int[] arr;

    public ShallowCloneExample() {
        arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }

    public void setArr(int paraIndex, int paraValue) {
        arr[paraIndex] = paraValue;
    }

    public int getArr(int paraIndex) {
        return arr[paraIndex];
    }

    @Override
    protected ShallowCloneExample clone() throws  CloneNotSupportedException {
        return (ShallowCloneExample) super.clone();
    }

    public static void main(String[] args) {
        ShallowCloneExample e1 = new ShallowCloneExample();
        ShallowCloneExample e2 = null;
        try {
            e2 = e1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        e1.setArr(2,222);
        System.out.println(e2.getArr(2));
    }
}
