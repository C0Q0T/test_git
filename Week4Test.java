package Week4;

import org.junit.Assert;
import org.junit.Test;

public class Week4Test {
   
    
    @Test
    public void testMax2Int3(){
        int max = Week4.max2Int(-1000,-9999);
        Assert.assertEquals(-1000,max);
    }

    @Test
    public void testMax2Int4(){
        int max = Week4.max2Int(1000,989);
        Assert.assertEquals(1000,max);
    }

    @Test
    public void testMax2Int5(){
        int max = Week4.max2Int(1000,7787);
        Assert.assertEquals(7787,max);
    }
    @Test
    public void testMinArray1(){
        int[] arr = {1,2,3,4,5};
        int min = Week4.minArray(arr);
        Assert.assertEquals(1,min);
    }

    @Test
    public void testMinArray2(){
        int[] arr = {1,2,3,-8,-10,-90};
        int min = Week4.minArray(arr);
        Assert.assertEquals(-90,min);
    }

    @Test
    public void testMinArray3(){
        int[] arr = {-999,1,2,3,-8,-10};
        int min = Week4.minArray(arr);
        Assert.assertEquals(-999,min);
    }

    @Test
    public void testMinArray4(){
        int[] arr = {1,2,3,-8,-10,0,89};
        int min = Week4.minArray(arr);
        Assert.assertEquals(-10,min);
    }

    @Test
    public void testMinArray5(){
        int[] arr = {1 ,2 ,3 ,-8 ,-10 ,-100};
        int min = Week4.minArray(arr);
        Assert.assertEquals(-100 ,min);
    }
    @Test
    public void testCalculateBMI1(){
        String w = Week4.calculateBMI(55 ,1.62);
        Assert.assertEquals("Bình Thường" ,w);
    }

    @Test
    public void testCalculateBMI2(){
        String w = Week4.calculateBMI(45 ,1.75);
        Assert.assertEquals("Thiếu cân" ,w);
    }

    @Test
    public void testCalculateBMI3(){
        String w = Week4.calculateBMI(90 ,2);
        Assert.assertEquals("Bình Thường" ,w);
    }

    @Test
    public void testCalculateBMI4(){
        String w = Week4.calculateBMI(120.9 ,2.0);
        Assert.assertEquals("Béo phì" ,w);
    }

    @Test
    public void testCalculateBMI5(){
        String w = Week4.calculateBMI(95 ,1.8);
        Assert.assertEquals("Béo phì" ,w);
    }
}
