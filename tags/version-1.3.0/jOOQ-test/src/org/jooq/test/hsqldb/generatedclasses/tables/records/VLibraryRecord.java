/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

import org.jooq.Result;
import org.jooq.impl.RecordImpl;
import org.jooq.test.hsqldb.generatedclasses.tables.VLibrary;


/**
 * This class is generated by jOOQ.
 */
public class VLibraryRecord extends RecordImpl {

	private static final long serialVersionUID = 1L;

	/**
	 * An uncommented item
	 */
	public void setAuthor(String value) {
		setValue(VLibrary.AUTHOR, value);
	}

	/**
	 * An uncommented item
	 */
	public String getAuthor() {
		return getValue(VLibrary.AUTHOR);
	}

	/**
	 * An uncommented item
	 */
	public void setTitle(String value) {
		setValue(VLibrary.TITLE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTitle() {
		return getValue(VLibrary.TITLE);
	}

	public VLibraryRecord(Result result) {
		super(result);
	}
}
