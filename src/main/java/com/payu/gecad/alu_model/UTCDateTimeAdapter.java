/** Apache licence v2.0 */

package com.payu.gecad.alu_model;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class UTCDateTimeAdapter extends XmlAdapter<String, OffsetDateTime> {

	private final DateTimeFormatter fmt = DateTimeFormatter
			.ofPattern("yyyy-MM-dd HH:mm:ss")
			.withZone(ZoneId.of("UTC"));

	@Override
	public OffsetDateTime unmarshal(String v) throws Exception {
		return OffsetDateTime.from(fmt.parse(v));
	}

	@Override
	public String marshal(OffsetDateTime v) throws Exception {
		return fmt.format(v);
	}
}
