package com.sx.fun;

import java.util.List;

import com.sx.db.ReaderDb;
import com.sx.entity.Reader;

public class ReaderOp {
	public static List<Reader> getReaders() {
		return ReaderDb.getReaderList();
	}

	public static List<Reader> getReaderByName(String Name) {
		return ReaderDb.getReaderByName(Name);
	}

	public static void delreader(int UID) {
		ReaderDb.delReader(UID);
	}

	public static List<Reader> getReaderByUID(int UID) {
		return ReaderDb.getReaderByUID(UID);
	}

	public static void insertReader(Reader reader) {
		ReaderDb.insertReader(reader);
	}

	public static void insertReaders(List<Reader> readerList) throws Exception {
		ReaderDb.insertReaderList(readerList);
	}

	public static void updateReader(Reader reader) {
		ReaderDb.updateReader(reader);
	}
}
