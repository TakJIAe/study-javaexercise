class Exercise3_2{
    public static void main(String[] args) {
        int numOfApples = 123; //사과의 개수
        int sizeofBucket = 10; //바구니의 크기
        
        //모든 사과를 담는데 필요한 바구니의 수
        int numOfBucket = numOfApples/sizeofBucket + ((numOfApples/sizeofBucket!=0) ? 1 : 0);

        System.out.println("필요한 바구니의 수:" + numOfBucket);
    }
}