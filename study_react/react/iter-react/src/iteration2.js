import React, {useState} from 'react';

const iteration2 = () => {
    const [names,setNames] = useState(
        [
            {id:1, text:'javascript'},
            {id:2, text:'jQuery'},            
            {id:3, text:'React'},            
        ]
    );
    const [nextId,setNextId] = useState(names.length+1);
    const onClick=()=>{
        //클릭하면 함수 실행
        setNames(names.concat({id:nextId,text:'Vue.js'}));
        setNextId(nextId+1);
    }
    const nameList = names.map((name)=> <li key={name.id}>{name.text}</li>)
    return (
        <div>
            <button onClick={onClick}>add</button>
            <ul>
                {nameList}
            </ul>
        </div>
    );
};

export default iteration2;