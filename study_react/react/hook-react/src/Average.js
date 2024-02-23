import React, { useCallback, useMemo, useRef, useState } from 'react';

const getAverage = (numbers) => {
    if(numbers.length == 0) return 0;
    const sum = numbers.reduce((a,b) => a+b); // [1,2,3,4] -> 1+2 > 3+3 > 6+4 > 10
    return sum / numbers.length;
};
const set1 = new Set();

const Average = () => {
    // 리스트, 빈 배열
    const [list,setList] = useState([]);
    // input으로 들어오는건 str 이기 때문에
    // '' 으로 표시
    const [number,setNumber] = useState('');
    const inputEl = useRef(null);
    const onClick = useCallback(() => {
        //현재 전달받은 값 number
        setList(list.concat(parseInt(number)));
        //update
        setNumber('');
        //inputEl 선언 후 focus
        inputEl.current.focus();
    // number 이나 list 가 바뀌었을 때 그때만 새로 만들어주게
    // parseInt 해줘서 number, list 같이 써주기
    // useCallback() 
    },[number,list]);
    set1.add(onClick);
    console.log(set1);

    // useMemo 사용 - input에 넣을때마다 계산중이 아니라 등록할때만
    const avg = useMemo(()=>getAverage(list),[list]);
    return (
        <div> 
            <input name='number' value={number} ref={inputEl} onChange={(e)=> setNumber(e.target.value)} />
            <button onClick={onClick}>등록</button> <br />
            <ul>
                {/* 반복되는 곳은 key 필요 */}
                {list.map((value,index) => <li key={index}>{value}</li>)}
            </ul>
            {/* 평균 : {getAverage(list)} */}
            평균 : {avg}
        </div>
    );
};

export default Average;