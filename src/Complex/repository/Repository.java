package Complex.repository;
import Complex.repository.AbstractRepository;

import java.util.stream.Collectors;

import Complex.model.NumarComplex;

public class Repository extends AbstractRepository<NumarComplex> {
    public void add(NumarComplex nrc) {
        entities.add(nrc);
    }

    public void remove(NumarComplex nrc) {
        entities.remove(nrc);
    }


}
