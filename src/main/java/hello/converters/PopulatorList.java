package hello.converters;

import java.util.List;

/**
 * Created by elili on 6/3/2016.
 */
public interface PopulatorList<SOURCE,TARGET>
{

    List<Populator<SOURCE, TARGET>> getPopulators();

    void setPopulators(List<Populator<SOURCE, TARGET>> populators);
}
