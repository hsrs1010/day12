package com.one;

public class jumpTest {
	public static void main(String[] args) {
		//점프라는 글자를 전달하면 포인트1000점 획득(점프 1000)
		//더블 점프라는 글자를 전달하면 포인트3000획득(더블점프 3000)
		// 적군 킬라는 글자를 전달하면 포인트5000획득(적군 킬 5000)
		//기타 없음
		ItemTrans its=new ItemTrans();
		
		its.getItem("점프");
		System.out.println("점프 포인트 : "+its.getjpoint());
		its.getItem("더블 점프");
		System.out.println("더블 점프 포인트 : "+its.getjpoint());
		its.getItem("적군킬");
		System.out.println("적군킬 : "+its.getjpoint());
		its.getItem("기타");
		System.out.println("기타 : "+its.getjpoint());
//		점프의 포인트 출력 :
		
	}
}
