package com.subbu.joketeller;

import android.test.AndroidTestCase;
import android.util.Pair;

import java.util.concurrent.ExecutionException;

/**
 * Created by subrahmanyam on 31-05-2016.
 */

public class NonEmptyTest extends AndroidTestCase {
    public void test() {
        String result = null;
        EndpointAsyncTask endpointAsyncTask = new EndpointAsyncTask();
        Pair pair = new Pair(this, null);
        try {
            result = (String) endpointAsyncTask.execute(pair).get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        assertNotNull(result);
    }
}
