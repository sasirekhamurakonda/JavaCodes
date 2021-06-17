package Flipkart;

public class AddTwoLinkedlists {
    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static ListNode addTwoNumbers(ListNode firstList, ListNode secondList) {
        // add your logic here
        int carry=0;
        ListNode finals=firstList;
        ListNode prev=firstList;
        while(firstList!=null&&secondList!=null){
            int a=firstList.data;
            firstList.data=(firstList.data+secondList.data)%10;
            carry=(a+secondList.data)/10;
            prev=firstList;
            firstList=firstList.next;
            secondList=secondList.next;
        }
        if(carry==1){
            if(firstList==null&&secondList==null){
                prev.next=new ListNode(1);
            }
            else if(secondList==null){
                int z=firstList.data+1;
                firstList.data=z%10;
                carry=z/10;
                while(carry==1&&firstList.next!=null){
                    firstList=firstList.next;
                    z=firstList.data+1;
                    firstList.data=z%10;
                    carry=z/10;
                }
                if(carry==1){
                    firstList.next=new ListNode(1);
                }
            }
            else if(firstList==null){
                int z=secondList.data+1;
                secondList.data=z%10;
                carry=z/10;
                while(carry==1&&secondList.next!=null){
                    secondList=secondList.next;
                    z=secondList.data+1;
                    secondList.data=z%10;
                    carry=z/10;
                }
                if(carry==1)
                    secondList.next=new ListNode(1);
                prev.next=secondList;
            }

        }
        else{
            if(secondList!=null){
                prev.next=secondList;
            }
        }
        return finals;
    }
    public static void main(String[] args){

    }
}
