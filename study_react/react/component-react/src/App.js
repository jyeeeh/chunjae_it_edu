import React from 'react';
import MyComponent from './MyComponent';
import MyComponentClass from './MyComponentClass';
import Counter from './Counter';
import Say from './Say';

const App = () => {

  return (
    <div>
      <Say />
      <Counter />
      <MyComponentClass name="class" />
      <MyComponent name={3} />
      <br />
      <MyComponent name="Sidebar" />
      <br />
      <MyComponent><s>리액트</s>입니다.</MyComponent>
    </div>
  );
};

export default App;