public class shallowCloneExample implements Cloneable{
    private int[] arr;

    public shallowCloneExample() {
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
    protected shallowCloneExample clone() throws  CloneNotSupportedException {
        return (shallowCloneExample) super.clone();
    }

    public static void main(String[] args) {
        shallowCloneExample e1 = new shallowCloneExample();
        shallowCloneExample e2 = null;
        try {
            e2 = e1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        e1.setArr(2,222);
        System.out.println(e2.getArr(2));
    }
}
