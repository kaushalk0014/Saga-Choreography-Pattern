package com.learning.event;

import java.util.Date;
import java.util.UUID;

public interface Event {
	
	UUID getEventId();
	Date getDate();
}
