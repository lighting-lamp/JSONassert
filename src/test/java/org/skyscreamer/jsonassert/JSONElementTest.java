package org.skyscreamer.jsonassert;

        import org.json.JSONException;
        import org.junit.Test;

public class JSONElementTest
{
    //CS304 (manually written) Issue link: https://github.com/skyscreamer/JSONassert/issues/88
    @Test
    public void testArrayCompareDifElement() throws JSONException {
        String actual =   "[{ \"id\" : \"123\", \"courseID\" : \"test\"},{ \"id\" : \"124\", \"courseID\" : \"te\"}] ";
        String expected = "[{ \"ID\" : \"127\", \"courseID\" : \"te\"},{ \"id\" : \"125\", \"courseID\" : \"ted\"}] ";
        JSONKeyAssert.assertNotEquals(expected, actual, false);
    }
    //CS304 (manually written) Issue link: https://github.com/skyscreamer/JSONassert/issues/88
    @Test
    public void testArrayCompareSameElement() throws JSONException {
        String actual =   "[{ \"id\" : \"123\", \"courseID\" : \"test\"},{ \"id\" : \"124\", \"courseID\" : \"te\"}] ";
        String expected = "[{ \"id\" : \"127\", \"courseID\" : \"te\"},{ \"id\" : \"125\", \"courseID\" : \"ted\"}] ";
        JSONKeyAssert.assertEquals(expected, actual, false);
    }
    //CS304 (manually written) Issue link: https://github.com/skyscreamer/JSONassert/issues/88
    @Test
    public void testObjectCompareSameElement() throws JSONException {
        String actual =   "{ \"id\" : \"123\", \"courseID\" : \"test\", \"title\" : \"ask question\", \"content\" : null }  ";
        String expected =  "{ \"id\" : \"1\", \"courseID\" : \"test\", \"title\" : \"answer question\", \"content\" : null }  ";
        JSONKeyAssert.assertEquals(expected, actual, true);
    }
    //CS304 (manually written) Issue link: https://github.com/skyscreamer/JSONassert/issues/88
    @Test
    public void testObjectCompareDifElement() throws JSONException {
        String actual =   "{ \"id\" : \"123\", \"courseID\" : \"test\", \"title\" : \"ask question\", \"content\" : null }  ";
        String expected =  "{ \"ID\" : \"1\", \"courseID\" : \"test\", \"title\" : \"answer question\", \"content\" : null }  ";
        JSONKeyAssert.assertNotEquals(expected, actual, true);
    }
}
