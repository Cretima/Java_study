import java.util.Scanner;

public class StringTest_03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("문장을 입력하시오:");
		String line = input.nextLine(); //nextLine: 한줄(엔터 전)까지 입력받음
		String lowerLine = line.toLowerCase(); //toLowerCase: 입력받은것을 모두 소문자로 변환후 리턴
		System.out.println("삭제할 단어를 입력하시오.:");
		String word = input.next().toLowerCase(); // 위의 10~11줄을 한줄로 줄일수있음.
		
		int beginIndex = lowerLine.indexOf(word); // indexOf: 찾는 문자가 lowerLine(변수)에 있는지 여부를 판단후 해당 단어시작위치값(11)을 반환
		
		//substring(시작 + 끝) 시작과 끝 사이의 모든 인덱스를 저장한다.
		String result = line.substring(0, beginIndex) //해당 줄처럼 시작부분에 두개의 인자를 받으면 마지막 인덱스(beginIndex)(11)전까지 즉 10 인덱스까지 값을 뽑아냄
						+ line.substring(beginIndex+word.length());// 해당 줄처럼 하나의 인자를 받으면 해당 위치(11 + 6)부터 끝까지 값을 뽑아냄. 
						// 즉 삭제할 단어(word) 이전까지의 인덱스와 삭제할 단어 이후부터 위치를 찾아서 그 사이 해당되지않는 인덱스를 result에 저장
		System.out.println("입력 단어가 삭제된 문장:\n"+ result);

	}

}
