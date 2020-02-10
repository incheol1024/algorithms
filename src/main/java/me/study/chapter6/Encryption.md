###Encyrption  
  
영문 텍스트가 아래의 암호화 스킴을 사용하면서 암호화 되는 것이 필요합니다.
첫째로, 공백은 텍스트에서 제거됩니다. 텍스트 L의 길이를 보자.
그러면 문자들이 하나의 그리드로 쓰여졌고, 이것의 열과 행은 아래의 제약 조건을 갖습니다.
  
예를 들어, 문장 s=if man was meant to stay on the ground got would have given roots 은, 공백 제거 후에
54개의 긴 문자입니다. 루트54는 7과 8사이이며, 그래서 7행 8열의 그리드 형태로 쓰여졌습니다.
  
ifmanwas  
meanttos          
tayonthe  
groundgo  
dwouldha  
vegivenu  
sroots
  
* row x columns >= L 임을 확실히 합니다.
* 여러개의 그리드가 위 조건을 만족한다면, 최소 영역을 가지는 것을 선택합니다. i.e rows x columns.

인코딩된 메세지는 한 열안의 문자들을 공백을 삽입한 뒤
그 다음 컬럼과 공백을 삽입함으로써 얻게 됩니다.
예를 들어 위 사각형에 대한 인코드된 메세지는   
imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau 입니다.  
당신은 인코드와 출력할 메세지를 받을 것입니다.

#####Function Description  
아래의 에디터안에 암호화 함수를 완성하세요. 이 함수는 설명 처럼 구성 된 단일 문자열을 리턴해야 합니다.
암호화는 아래의 파라미터를 가집니다.
* s: 암호화할 하나의 문자열

#####Input Format  
텍스트 한줄, 문자열 s

#####Constraints  
1 <= |s| <= 81  
s 아스키범위[a-z]의 문자들로 이루어 집니다.

