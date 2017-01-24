import oracle.iot.analytics.StreamingAnalyticsProcessor;
import oracle.iot.analytics.Link;
import oracle.iot.analytics.RESTRequest;
import oracle.iot.analytics.DataOutput;
import oracle.iot.analytics.StreamingAnalyticsProcessorBase;
import oracle.iot.analytics.BatchAnalyticsProcessorBase;
import oracle.iot.analytics.PairDataOutput;
import oracle.iot.analytics.RESTRequest;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.streaming.api.java.JavaDStream;
import javax.inject.Inject;



public class abc implements StreamingAnalyticsProcessor {

	 @Inject @Link("YIDeviceMessageLink")
		private JavaDStream<String> input_yidevicemessagelink;

		@Inject @Link("YIDeviceNoSqlLink")
		private DataOutput<String> output_yidevicenosqllink;
		
	@Override
	public void setup() throws Exception {
		
		output_yidevicenosqllink.write(input_yidevicemessagelink.map(new Function<String, String>() {

			/**
			 * 
			 */
			private static final long serialVersionUID = -1955442514360740359L;

			@Override
			public String call(String arg0) throws Exception {
				return null;
			}
		}));
	}

}
