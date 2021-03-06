package org.apache.ambari.views.service.db;

import com.google.common.base.Optional;
import org.apache.ambari.views.service.api.Instance;

import java.util.List;

public interface DbService {
    Instance persistInstance(Instance toPersist);

    Optional<Instance> loadInstance(String instanceID);

    List<Instance> getAllInstances();
}
