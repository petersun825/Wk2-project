import React, {Component} from 'react';
import {Brush, CartesianGrid, Legend, Line, LineChart, ResponsiveContainer, Tooltip, XAxis, YAxis} from "recharts";
import '../App.css'

const legend = [
    {value: 'Total books', color: '#4ece0e'},
    {value: 'Borrowed books', color: '#4262f4'},
    {value: 'Available books', color: '#be0596'},
];
const payload = [
    {name: 'Total books'},
    {name: 'Borrowed books'},
    {name: 'Available books'},
];

export default class Statistics extends Component {

    constructor(props) {
        super(props);

        this.state = {
            opacity: 1
        };
    }

    handleLegendMouseEnter = () => {
        this.setState({
            opacity: 0.5,
        });
    };

    handleLegendMouseLeave = () => {
        this.setState({
            opacity: 1,
        });
    };

    render() {
        return (
            <div className={'App'}>
                <ResponsiveContainer width={'95%'} height={900}>
                    <LineChart data={this.props.data}
                               margin={{top: 5, right: 20, left: 100, bottom: 5}}>
                    <Legend
                            layout="horizontal"
                            width={800} height={100} payload={legend}
                            onMouseEnter={() => this.handleLegendMouseEnter()}
                            onMouseLeave={() => this.handleLegendMouseLeave()}
                        />
                        <Line type="monotone" dataKey="totalBooksCount" stroke="#4ece0e"/>
                        <Line type="monotone" dataKey="borrowedBooksCount" stroke="#4262f4"/>
                        <Line type="monotone" dataKey="availableBooksCount" stroke="#be0596"/>
                        <CartesianGrid stroke="#ccc" strokeDasharray="5 5"/>
                        <Tooltip payload={payload}/>
                        <XAxis dataKey="date"/>
                        <YAxis domain={['auto']} type="number"/>
                        <Brush dataKey="date" height={30}/>
                    </LineChart>
                </ResponsiveContainer>
                <div className={'m'}>
                    <div className={'windows'}>
                        <div>
                            <h5>Books borrowed over last week</h5>
                            <h6>18/3 - 25/3</h6>
                        </div>
                        <h5>+6 %</h5>
                    </div>
                    <div className={'windows'}>
                        <div><h5>Number of books borrowed</h5></div>
                        <h5>300,500</h5>
                    </div>
                    <div className={'windows'}>
                        <div>
                            <h5>Number of books available</h5>
                        </div>
                        <h5>105605</h5>
                    </div>
                </div>
            </div>
        )
    }
}