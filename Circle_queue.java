public class Circle_queue {
        private int[]mass;
        private int maxsize;
        private int front;
        private int real;
        public Circle_queue(int size) {
            this.mass=new int[size+1];
            this.maxsize=size;
            this.front=0;
            this.real=0;
        }

        public void getQueue(int n){
            if(isFull()){
                throw new RuntimeException("队列满了");
            }
            mass[real]=n;
            real=(real+1)%maxsize;
        }
        public void setQueue(){
            if(isEmpty()){
                throw new RuntimeException("队列为空");
            }
            System.out.println(mass[front]);
            front=(front+1)%maxsize;
        }

        public boolean isFull(){
            return front==(real+1)%maxsize;
        }
        public boolean isEmpty(){
            return real==front;
        }

        public void showQueue(){
            if(isEmpty()){
                System.out.println("空");
                return;
            }
            for (int i=0;i<(real+maxsize-front)%maxsize;i++){
                System.out.printf("%d\t",mass[i]);
            }

        }
        public void head(){
            if(isEmpty()){
                System.out.println("空");
                return;
            }
            System.out.println(mass[(front+1)%maxsize]);
        }

}
