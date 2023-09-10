package com.Butterfly.Project1.Exercise001;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("main")
public interface DataService {

	int[] retrieveData();
}
