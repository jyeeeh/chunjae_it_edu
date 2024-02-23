import React, { useState } from 'react';
import TodoTemplate from './components/TodoTemplate';
import TodoInsert from './components/TodoInsert';
import TodoList from './components/TodoList';

const App = () => {
  // 배열 안에 임시 data 입력
  // useState에 값을 저장하면  'const [1,2]
  // - (1) state를 관리하기위한 state 명을 명시, 
  // - (2) 값 변경용 
  const [todos, setTodos] = useState(
    [
      //checked - check box boolean 값으로 설정
      {id:1, text:'일정1', checked:true},
      {id:2, text:'일정2', checked:true},
      {id:3, text:'일정3', checked:false}
    ]
  );

  return (
    // data 말고도 component 도 넘어감
    <TodoTemplate>
      <TodoInsert />
      <TodoList todos={todos} />
    </TodoTemplate>
  );
};

export default App;