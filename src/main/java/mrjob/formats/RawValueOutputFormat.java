package mrjob.formats;

import org.apache.hadoop.mapred.lib.MultipleTextOutputFormat;
import org.apache.hadoop.io.Text;
/**
 * RawValueOutputFormat
 *
 * Works with mrjob.protocol.ReprOutput
 *
 */
public class RawValueOutputFormat extends MultipleTextOutputFormat<Text, Text> {
    @Override
    protected String generateFileNameForKeyValue(Text key, Text value, String filename) {
        return key.toString() + "/" + filename;
    }

    @Override
    protected Text generateActualKey(Text key, Text value) {
        return null;
    }
}
