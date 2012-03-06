package cascalog.nutch;

import java.io.IOException;

import org.apache.hadoop.mapred.OutputCollector;

import cascading.scheme.SequenceFile;
import cascading.tuple.Fields;
import cascading.tuple.Tuple;
import cascading.tuple.TupleEntry;

public class ParseTextScheme extends SequenceFile {

	private static final long serialVersionUID = 1L;

	public ParseTextScheme() {
		super(new Fields("url", "parse-text"));
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void sink(TupleEntry tupleEntry, OutputCollector outputCollector) throws IOException {
		throw new UnsupportedOperationException("Sink not yet imlemented.");
	}
	
	@Override
	public Tuple source(Object key, Object value) {
		Tuple tuple = new Tuple();
		tuple.add(key);
		tuple.add(value);
		return tuple; 		
	}

}
