package BasicsOfJava;

class Test {
    int a, b;
    Test(int i, int j) {
        a = i;
        b = j;
    }
    // return true if o is equal to the invoking object
    boolean equals(Test o) {
        if(o.a == a && o.b == b) return true;
        else return false;
    }
}
class PassOb {
    public static void main(String args[]) {
        Test ob1 = new Test(100, 22);
        Test ob2 = new Test(100, 22);
        Test ob3 = new Test(-1, -1);
        System.out.println("ob1 == ob2: " + ob1.equals(ob2));
        System.out.println("ob1 == ob3: " + ob1.equals(ob3));
    }
}
/*
        1.	public class Test
        2.	{
        3.		private int num;
        4.		private String data;
        5.
        6.		public boolean equals(Object obj)
        7.		{
        8.			if(this == obj)
        9.				return true;
        10.			if((obj == null) || (obj.getClass() != this.getClass()))
        11.				return false;
        12.			// object must be Test at this point
        13.			Test test = (Test)obj;
        14.			return num == test.num &&
        15.			(data == test.data || (data != null && data.equals(test.data)));
        16.		}
        17.
        18.		public int hashCode()
        19.		{
        20.			int hash = 7;
        21.			hash = 31 * hash + num;
        22.			hash = 31 * hash + (null == data ? 0 : data.hashCode());
        23.			return hash;
        24.		}
        25.
        26.		// other methods
        27.	}

 */