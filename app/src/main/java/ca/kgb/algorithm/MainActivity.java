package ca.kgb.algorithm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Find number of unique values Test
        int[] numbs = {1, 2, 3, 3, 4, 4, 5, 2, 6, 6, 4, 3, 2, 1, 2, 3, 5};
        Log.d(TAG, "onCreate: countRepeatedValues : " + countRepeatedValues(numbs));

        //Largest range calculated.
        int[] numbs2 = {1, 4, 8, 10};
        Log.d(TAG, "onCreate: largestRange : " + largestRange(numbs2));

        int[] numbs3 = {1, 2, 3, 3};
        Log.d(TAG, "onCreate: Equilibrium : " + collectionEquilibrium(numbs3));
    }

    public int countRepeatedValues(int[] numbers) {
        //int count =0;
        Set<Integer> unique = new HashSet<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            //if ( !unique.contains(numbers[i])) {
            unique.add(numbers[i]);
            //  count++;
            //}

        }

        return unique.size();
    }

    public int largestRange(int[] orderedArray) {
        int largestRangeNumb = -1;
        int temp = 0;
        //for (int i = 0; i < orderedArray.length; i++) {
        //for (int n = i+1; n < orderedArray.length; n++) {
        temp = (orderedArray[orderedArray.length - 1] - orderedArray[0]);
        if (0 < temp &&
                largestRangeNumb < temp) {
            largestRangeNumb = temp;
        }

        // }
        //}
        return largestRangeNumb;
    }

    public int collectionEquilibrium(int[] array) {
        int sumL;
        int sumR;
        for (int i = 1; i < array.length-1; i++) {
            sumL = 0;
            sumR = 0;
            for (int n = i -1; n >= 0; n--) {
                sumL += array[n];
            }
            for (int n = i + 1; n < array.length; n++) {
                sumR += array[n];
            }
            //Log.d(TAG, "collectionEquilibrium:L:" + sumL + " R: " + sumR);
            if(sumL == sumR)
                return 1;
        }
        return 0;
    }
}
