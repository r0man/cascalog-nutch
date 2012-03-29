package cascalog.nutch;

import java.io.IOException;

import org.apache.hadoop.mapred.OutputCollector;

import cascading.scheme.SequenceFile;
import cascading.tuple.Fields;
import cascading.tuple.Tuple;
import cascading.tuple.TupleEntry;

public class NutchScheme extends SequenceFile {

    private static final long serialVersionUID = 1L;

    public NutchScheme(Fields fields) {
        super(fields);
    }

    @SuppressWarnings("rawtypes")
    @Override
    public void sink(TupleEntry tupleEntry, OutputCollector outputCollector) throws IOException {
        throw new UnsupportedOperationException("Sink not yet imlemented.");
    }

    @Override
    public Tuple source(Object key, Object value) {
        Tuple tuple = new Tuple();
        tuple.add(key.toString());
        tuple.add(value);
        return tuple;
    }

}
