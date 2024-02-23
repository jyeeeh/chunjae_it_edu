import React from 'react';
import Counter from './Counter';
import Info from './Info';
import CountReducer from './CountReducer';
import Average from './Average';

const App = () => {
  return (
    <div>
      <Average />
      <hr />
      <CountReducer />
      <hr />
      <Info />
      <hr />
      {/* Counter 렌더링 */}
      <Counter />
    </div>
  );
};

export default App;