import React from "react";

class App extends React.Component {
    constructor(props) {
      super(props);
      this.state = {
        appState: 'Loading...'
      };
    }
  
  componentDidMount() {
    fetch("/react-with-spring/test", { method: "GET" }).then(resp => {
        window.animation.destroy();
        if (resp.ok) {
          this.setState({appState: 'Everything is OK :)'});
        } else {
          this.setState({appState: 'Something went wrong :('});
        }
    })
  }
  
   render() {
          return (
              <div>{this.state.appState}</div>
          );
      }
  }

  export default App;
