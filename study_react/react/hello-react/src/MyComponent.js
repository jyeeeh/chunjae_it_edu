import React from 'react';

const MyComponent = (props) => {
    return (
        // <div>
        //     {props.name} 컴포넌트
        // </div>
        <div>
            {props.name} 컴포넌트 <br />
            children:{props.children}
        </div>
    );
};

export default MyComponent;