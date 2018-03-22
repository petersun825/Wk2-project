import React, {Component} from 'react';
import './App.css';
import Header from "./component/header.component";
import Statistics from "./component/stat.component";
import {Footer} from "react-materialize";

class App extends Component {


    constructor(props) {
        super(props);

        this.state = {
            books: [],
            labels: [],
        }
    }

    render() {
        return (
            <div>
                <Header/>
                <Statistics data={this.state.books}/>
                <Footer copyrights="2018 Copyright" className={'indigo darken-1'}>
                </Footer>
            </div>
        );
    }

    componentDidMount() {
        fetch("http://localhost:8081/books")
            .then(res => res.json())
            .then(
                (result) => {
                    this.setState({
                        isLoaded: true,
                        books: result.data
                    });
                },
                (error) => {
                    this.setState({
                        isLoaded: true,
                        error
                    });
                }
            )
    }
}

export default App;
