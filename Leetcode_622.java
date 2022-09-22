public class Leetcode_622 {
    public static void main(String[] args) {

        MyCircularQueue circularQueue = new MyCircularQueue(3); // 设置长度为 3
        System.out.printf("%b\t%b\t%b\t%b\t%d\t%b\t%b\t%b\t%d",circularQueue.enQueue(1),circularQueue.enQueue(2),circularQueue.enQueue(3),circularQueue.enQueue(4),circularQueue.Rear(),circularQueue.isFull(),circularQueue.deQueue(),circularQueue.enQueue(4),circularQueue.Rear());
    }

   static class MyCircularQueue {

        // 构造器，设置队列长度为 k 。
        private int []mass;
        private int rear;
        private int frount;
        private int maxsize;

        public MyCircularQueue(int k) {
            mass=new int[k+1];
            rear=0;
            frount=0;
            maxsize=k+1;
        }
       //向循环队列插入一个元素。如果成功插入则返回真。
        public boolean enQueue(int value) {
            if(isFull()){
                return false;
            }
            mass[rear]=value;
            rear=(rear+1)%maxsize;
            return true;
        }
        //从循环队列中删除一个元素。如果成功删除则返回真。
        public boolean deQueue() {
            if(isEmpty()){
                return false;
            }
            frount=(frount+1)%maxsize;
            return true;
        }
        //从队首获取元素。如果队列为空，返回 -1 。
        public int Front() {
            if(isEmpty()){
                return -1;
            }
            return mass[frount];
        }
        //获取队尾元素。如果队列为空，返回 -1 。
        public int Rear() {
            if(isEmpty()){
                return -1;
            }
            return mass[(rear-1+maxsize)%maxsize];
        }
        //检查循环队列是否为空。
        public boolean isEmpty() {
            return frount==rear;
        }
        //检查循环队列是否已满。
        public boolean isFull() {
            return (rear+1)%maxsize==frount;
        }
    }

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
}
