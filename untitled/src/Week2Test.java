import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


class Week2Test {

   @Test
    void maximum() {
       int[] values = {5,7,9,2,1,11,13,8};
       assertEquals(13,Week2.maximum(values,0,values.length));
       assertEquals(11, Week2.maximum(values,3,6));
    }
}