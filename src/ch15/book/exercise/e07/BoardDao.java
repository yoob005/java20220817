package ch15.book.exercise.e07;

import java.util.*;

public class BoardDao {

	

	public List<Board> getBoardList() {
		
//		List<Board> list = new Vector<Board>();
//		
//		list.add(new Board("제목1", "내용1"));
//		list.add(new Board("제목2", "내용2"));
//		list.add(new Board("제목3", "내용3"));
//		
//		return list;
		
		List<Board> list = new ArrayList<>();
//		list.add(new Board("제목1", "내용1"));
//		list.add(new Board("제목2", "내용2"));
//		list.add(new Board("제목3", "내용3"));
		
		for(int i = 1; i < 4; i++) {
			list.add(new Board("제목" + i, "내용" + i));
		}
		
		return list;
		
	}
	
	
	
}
