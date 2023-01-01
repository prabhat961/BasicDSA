package queue;
 class petrolPump
{
    int petrol;
    int distance;

    // constructor
    public petrolPump(int petrol, int distance)
    {
        this.petrol = petrol;
        this.distance = distance;
    }
}
public class circularTour {
    //Method 1: Naive
    public static int printPetrolPump(int[]  petrol, int[] dist, int n ){
        for (int start = 0; start < n; start++){
            int curr_petrol = 0;
            int end = start;
            while (true){
                curr_petrol += (petrol[end] - dist[end]);
                if (curr_petrol < 0)
                    break;;
                    end = (end + 1)%n;
                    if (end == start)
                        return (start + 1);
            }
        }
        return -1;
    }
    //Method 2: Use Dequeue
   public static int printTour(petrolPump arr[], int n) {
        int start = 0;
        int end = 1;
        int curr_petrol = arr[start].petrol - arr[start].distance;
        while(end != start || curr_petrol < 0) {
            while(curr_petrol < 0 && start != end) {
                curr_petrol -= arr[start].petrol - arr[start].distance;
                start = (start + 1) % n;
                if(start == 0)
                    return -1;
            }
            curr_petrol += arr[end].petrol - arr[end].distance;
            end = (end + 1)%n;
        }
        return start;
    }
}
