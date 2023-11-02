'use strict'
//231017


//(1)
// 호이스팅 때문에 선언이 끌어올려져서 오류 안남.
// console.log(text); // (선언 + 초기화 된 상태)
// text = 'Hanamon!'; // (선언 + 초기화 + 할당 된 상태)
// var text;
// console.log(text);


// (2)
// foo1(); // 함수 선언문에서는 호이스팅 일어난다.
// foo2(); // 함수 표현식이라서 호이스팅 안된다. 
// function foo1() {
//   console.log('Hello');
// }
// var foo2 = function() {     //대입이 일어나서 호이스팅이 되지 않음
//   console.log('world');
// }

//(3)
// let string="17"+17;
// console.log(string); //=> 1717 (이어붙이기)
// let string2=17+17;
// console.log(string2); //=>34 (계산)

//(4)
// let string=`문자열(")
// 작은따옴표(')
// 줄바꿈`;
// console.log(string);   //=>그대로 출력 (줄바꿈 포함)

// (5)
// let num1=10;
// let num2=0.1;
// let mysum=`${num1}과 ${num2}를 곱하면 ${num1*num2}이다.`  //값이 들어감
// console.log(mysum);

//(6)배열
// let array = ['abc', 10, true, undefined, null, [], {}, function(){}];
// for ( var value of array){
//     console.log(value);
// }