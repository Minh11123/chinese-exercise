package com.webTOCFL.entities;

// tên các part trong TOCFL
public enum Part {
	
	PART1_PHOTOGRAPHS(1), PART2_QUESTION_RESPONSE(2), PART3_SHORT_CONVERSATIONS(3), PART4_SHORT_TALKS(4),
	PART5_COMPLETE_SENTENCE(5), PART6_COMPLETE_THE_PARAGRAPH(6), PART7_READING_COMPREHENSION(7);
	
	private int value;
	
	private Part(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
    public static Part fromId(int id) {
        for (Part type : values()) {
            if (type.getValue() == id) {
                return type;
            }
        }
        return null;
    }

}
