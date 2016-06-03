package hello.converters;

/**
 * Created by elili on 6/3/2016.
 */
public interface Populator<SOURCE,TARGET>
{
    void populate(SOURCE source, TARGET target) throws ConversionException;
}
