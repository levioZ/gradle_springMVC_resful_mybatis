package hello.converters;



/**
 * Created by elili on 6/3/2016.
 */
public interface Converter<SOURCE, TARGET> extends org.springframework.core.convert.converter.Converter<SOURCE, TARGET>
{
    TARGET convert(SOURCE var1) throws ConversionException;

    TARGET convert(SOURCE var1, TARGET var2) throws ConversionException;

}
