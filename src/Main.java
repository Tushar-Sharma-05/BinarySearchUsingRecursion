public class Main {
    public static void main(String[] args) {


                int[] arr = {1,4,3,6,7,3,8};


                System.out.println(binarysearch(arr,8,0,arr.length-1));

            }



            static int binarysearch(int[] arr,int target,int s,int e){


                if(s>e){
                    return -1;
                }

                int m = s + (e-s)/2;
                if(arr[m] == target){
                    return m;
                }

                if(target<arr[m]){
                    return  binarysearch(arr,target,s,m-1);
                }
                return  binarysearch(arr,target,m+1,e);

            }


        }

